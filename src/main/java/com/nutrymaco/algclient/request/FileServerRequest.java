package com.nutrymaco.algclient.request;

import com.nutrymaco.alg.AlgorithmRequest;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Iterator;
import java.util.List;

public class FileServerRequest implements ServerRequest {

    private final Iterator<String> lines1;
    private final Iterator<String> lines2;

    public FileServerRequest(Path path1, Path path2) throws IOException {
        lines1 = Files.readAllLines(path1).listIterator();
        lines2 = Files.readAllLines(path2).listIterator();
    }


    @Override
    public AlgorithmRequest getRequest() {
        return AlgorithmRequest.newBuilder()
                .setString1(lines1.next())
                .setString2(lines2.next())
                .build();
    }

    @Override
    public boolean isEnd() {
        return !lines1.hasNext();
    }
}
