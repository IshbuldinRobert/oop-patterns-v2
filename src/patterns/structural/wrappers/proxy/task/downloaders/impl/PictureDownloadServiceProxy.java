package patterns.structural.wrappers.proxy.task.downloaders.impl;

import patterns.structural.wrappers.proxy.task.downloaders.Downloader;
import patterns.structural.wrappers.proxy.task.downloaders.PictureDownloaderProxy;
import patterns.structural.wrappers.proxy.task.downloaders.validators.PictureComparator;

public class PictureDownloadServiceProxy implements Downloader {
    private final Downloader downloader;
    private final PictureComparator comparator;

    public PictureDownloadServiceProxy(Downloader downloader) {
        this.downloader = downloader;
        this.comparator = new PictureComparator();
    }

    @Override
    public void download(String path, String filename) {
        long startTime = System.currentTimeMillis();
        if (comparator.arePictureEqual(path)) {
            System.out.println("Start download");
            System.out.println((System.currentTimeMillis() - startTime)/1000);
            System.out.println("Download end");
        }
        else {
            downloader.download(path, filename);
        }
    }
}
