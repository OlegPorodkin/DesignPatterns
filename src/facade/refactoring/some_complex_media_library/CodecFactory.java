package facade.refactoring.some_complex_media_library;

public class CodecFactory {
    public static Codec extract(VideoFile videoFile){
        String type = videoFile.getCodecType();
        if (type.equals("mp4")){
            System.out.println("CodecFactory: extracting mpeg audio...");
            return new MPEG4CompressionCodec();
        }
        else {
            System.out.println("CodecFactory: extracting ogg audio...");
            return new OggCompressionCodec();
        }
    }
}
