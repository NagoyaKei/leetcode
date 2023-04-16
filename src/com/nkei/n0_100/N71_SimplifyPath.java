package com.nkei.n0_100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class N71_SimplifyPath {

    public String simplifyPath(String path) {
        List<String> pathArray = Arrays.stream(path.split("/"))
                .filter(f-> !f.isBlank() && !f.equals("."))
                .collect(Collectors.toList());
        List<String> newPath = new ArrayList<>();
        for (int i = 0; i < pathArray.size(); i++) {
            String p = pathArray.get(i);
            if (p.equals("..")) {
                if (i != 0) {
                    int toIndex = Math.max(newPath.size() - 1, 0);
                    newPath = newPath.subList(0, toIndex);
                }
            } else {
                newPath.add(p);
            }
        }

        return "/" + String.join("/", newPath);
    }
}
