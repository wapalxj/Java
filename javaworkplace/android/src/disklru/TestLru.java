package disklru;

import disklru.bean.User;
import disklru.lru.DiskLruCache;
import disklru.utils.DiskLrucacheUtils;

import java.io.IOException;

public class TestLru {
    private static String url = "vero";
    private static void save() throws IOException {
        DiskLruCache lruCache = DiskLruCache.open(DiskLrucacheUtils.getDiskCacheDir("vero1"), 1, 1, 10 * 1024 * 1024);
        User user = new User();
        user.name = "vnix";
        user.age = 20;
        DiskLrucacheUtils.saveObject(url, user, 0, lruCache);
    }

    private static void read() throws IOException {
        DiskLruCache lruCache = DiskLruCache.open(DiskLrucacheUtils.getDiskCacheDir("vero1"),
                1,
                1,
                10 * 1024 * 1024);
        User user = DiskLrucacheUtils.readDataCache(lruCache, url);
        lruCache.flush();
        System.out.println(user);
    }

    private static void delete() throws IOException {
        DiskLruCache lruCache = DiskLruCache.open(DiskLrucacheUtils.getDiskCacheDir("vero1"), 1, 1, 10 * 1024 * 1024);
        lruCache.delete();
    }


    public static void main(String[] args) throws IOException {
//        save();
        read();
//        delete();
    }
}
