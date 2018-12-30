package facade.refactoring;

import facade.refactoring.facade.VideoConversionFacade;
import facade.refactoring.some_complex_media_library.VideoFile;

import java.io.File;

public class Demo {
    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
    }
}
