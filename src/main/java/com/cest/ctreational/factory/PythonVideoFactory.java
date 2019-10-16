package com.cest.ctreational.factory;

/**
 * Created by cestlavie on 2019/10/16.
 */
public class PythonVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
