package org.omg.CosNaming;

/**
* org/omg/CosNaming/NamingContextExtHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u112/7884/corba/src/share/classes/org/omg/CosNaming/nameservice.idl
* Thursday, September 22, 2016 9:33:08 PM PDT
*/


/** 
 * <code>NamingContextExt</code> is the extension of <code>NamingContext</code>
 * which
 * contains a set of name bindings in which each name is unique and is
 * part of Interoperable Naming Service.
 * Different names can be bound to an object in the same or different
 * contexts at the same time. Using <tt>NamingContextExt</tt>, you can use
 * URL-based names to bind and resolve. <p>
 * 
 * See <a href="http://www.omg.org/technology/documents/formal/naming_service.htm">
 * CORBA COS 
 * Naming Specification.</a>
 */
public final class NamingContextExtHolder implements org.omg.CORBA.portable.Streamable
{
  public NamingContextExt value = null;

  public NamingContextExtHolder ()
  {
  }

  public NamingContextExtHolder (NamingContextExt initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = NamingContextExtHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    NamingContextExtHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return NamingContextExtHelper.type ();
  }

}
