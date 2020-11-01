/*
 * Copyright (c) 1996, 2013, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

package java.io;


/**
 * A character stream whose source is a string.
 *
 * @author      Mark Reinhold
 * @since       JDK1.1
 */

public class StringReader extends Reader {

    //内置了一个String类型的变量，用于存储读取的内容
    //因为Reader只需要读取无需对数据进行改变
    //所以此时一个String类型变量就已经足够了
    private String str;

    //定义了3个int型变量
    private int length;//表示读取的字符串数据的长度
    private int next = 0;//表示下一个要读取的位置
    private int mark = 0;//mark表示标记的位置

    /**
     * Creates a new string reader.
     *
     * @param s  String providing the character stream.
     */

    /**
     * 一个带一个参数的构造方法，
     * 传入的参数是一个String类型数据，
     * 通过s初始化内置的str和length属性。
     */
    public StringReader(String s) {
        this.str = s;
        this.length = s.length();
    }

    /**
     * 该方法用于判断当前流是否处于开启状态，
     * 本质就是检测内置的str是否被赋值。
     */
    private void ensureOpen() throws IOException {
        if (str == null)
            throw new IOException("Stream closed");
    }

    /**
     * Reads a single character.
     *
     * @return     The character read, or -1 if the end of the stream has been
     *             reached
     *
     * @exception  IOException  If an I/O error occurs
     *
     *
     */

    /**
     * 每次读取一个字符的read方法
     * 最终返回读取字符的int值。
     */
    public int read() throws IOException {
        synchronized (lock) {
            //进行操作前，确保当前流处于开启状态
            ensureOpen();

            //如果读取的位置，超过了数据的总长度，那么直接返回-1，表示已无数据可读。
            if (next >= length)
                return -1;

            //通过next索引结合String类型的charAt方法
            return str.charAt(next++);
        }
    }

    /**
     * Reads characters into a portion of an array.
     *
     * @param      cbuf  Destination buffer
     * @param      off   Offset at which to start writing characters
     * @param      len   Maximum number of characters to read
     *
     * @return     The number of characters read, or -1 if the end of the
     *             stream has been reached
     *
     * @exception  IOException  If an I/O error occurs
     */

    /**
     * 每次读入多个字符的read方法，
     * 最终返回实际读取的字符个数。
     * 该方法有3个参数，
     * 第一个参数为一个字符数组，用于存储读取的数据，
     * 第二和第三个参数为一个int变量，
     * 分别为开始在数组中存储数据的起点和存储数据的长度。
     */
    public int read(char cbuf[], int off, int len) throws IOException {
        synchronized (lock) {
            ensureOpen();

            //安全检测，如果不合法则抛出相应异常。
            if ((off < 0) || (off > cbuf.length) || (len < 0) ||
                ((off + len) > cbuf.length) || ((off + len) < 0)) {
                throw new IndexOutOfBoundsException();
            } else if (len == 0) {
                return 0;
            }
            //无数据可读
            if (next >= length)
                return -1;

            //定义了一个int型值n，用来接收length-next和len之间的较小值，
            // 一般情况下使用len即可，
            // 如果len长度超过了数据的总长度，
            // 那么就使用length-next的值。
            int n = Math.min(length - next, len);
            str.getChars(next, next + n, cbuf, off);

            //next后移位n位，最后返回实际读取的数据长度。
            next += n;
            return n;
        }
    }

    /**
     * Skips the specified number of characters in the stream. Returns
     * the number of characters that were skipped.
     *
     * <p>The <code>ns</code> parameter may be negative, even though the
     * <code>skip</code> method of the {@link Reader} superclass throws
     * an exception in this case. Negative values of <code>ns</code> cause the
     * stream to skip backwards. Negative return values indicate a skip
     * backwards. It is not possible to skip backwards past the beginning of
     * the string.
     *
     * <p>If the entire string has been read or skipped, then this method has
     * no effect and always returns 0.
     *
     * @exception  IOException  If an I/O error occurs
     */

    /**
     * 跳过指定长度的数据。
     */
    public long skip(long ns) throws IOException {
        synchronized (lock) {
            ensureOpen();
            if (next >= length)//无法再跳过数据进行读取了
                return 0;
            // Bound skip by beginning and end of the source
            // 还有没有ns个可以跳，没有就跳过全部。
            long n = Math.min(length - next, ns);

            //当传入的值为负数时，此时读取位置应当向回移动
            //Math.max(-next,n)则保证了最多之能回退到数据的起点位置。
            n = Math.max(-next, n);
            next += n;
            return n;
        }
    }

    /**
     * Tells whether this stream is ready to be read.
     *
     * @return True if the next read() is guaranteed not to block for input
     *
     * @exception  IOException  If the stream is closed
     */

    /**
     * 该方法用于判断当前流是否处于可读状态。
     */
    public boolean ready() throws IOException {
        synchronized (lock) {
        ensureOpen();
        return true;
        }
    }

    /**
     * Tells whether this stream supports the mark() operation, which it does.
     */

    /**
     * 该方法用于判断当前流是否支持流标记功能。
     */
    public boolean markSupported() {
        return true;
    }

    /**
     * Marks the present position in the stream.  Subsequent calls to reset()
     * will reposition the stream to this point.
     *
     * @param  readAheadLimit  Limit on the number of characters that may be
     *                         read while still preserving the mark.  Because
     *                         the stream's input comes from a string, there
     *                         is no actual limit, so this argument must not
     *                         be negative, but is otherwise ignored.
     *
     * @exception  IllegalArgumentException  If {@code readAheadLimit < 0}
     * @exception  IOException  If an I/O error occurs
     */

    //该方法用于在指定位置留下流标记，
    // 与reset方法连用，可以将当前读取位置回退到在流中的标记位置
    public void mark(int readAheadLimit) throws IOException {
        if (readAheadLimit < 0){
            throw new IllegalArgumentException("Read-ahead limit < 0");
        }
        synchronized (lock) {
            ensureOpen();
            mark = next;
        }
    }

    /**
     * Resets the stream to the most recent mark, or to the beginning of the
     * string if it has never been marked.
     *
     * @exception  IOException  If an I/O error occurs
     */

    /**
     * 该方法用于将当前读取位置回退到流中的标记位置。
     */
    public void reset() throws IOException {
        synchronized (lock) {
            ensureOpen();
            next = mark;
        }
    }

    /**
     * Closes the stream and releases any system resources associated with
     * it. Once the stream has been closed, further read(),
     * ready(), mark(), or reset() invocations will throw an IOException.
     * Closing a previously closed stream has no effect.
     */
    public void close() {
        str = null;
    }
}
