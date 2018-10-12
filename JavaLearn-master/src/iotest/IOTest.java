package iotest;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.stream.Stream;
import java.util.zip.CRC32;

/**
 * Created with Intellij IDEA.
 *
 * @author potoyang
 * @since 2018/10/8 11:00
 * Modified By:
 * Description:
 */
public class IOTest {
    /**
     * 普通输入流
     *
     * @param filename
     * @return
     * @throws IOException
     */
    public static long checksumInputStream(Path filename) throws IOException {
        try (InputStream in = Files.newInputStream(filename)) {
            CRC32 crc = new CRC32();

            int c;
            while ((c = in.read()) != -1) {
                crc.update(c);
            }
            return crc.getValue();
        }
    }

    /**
     * 带缓冲的输入流
     *
     * @param filename
     * @return
     * @throws IOException
     */
    public static long checksumBufferedInputStream(Path filename) throws IOException {
        try (InputStream in = new BufferedInputStream(Files.newInputStream(filename))) {
            CRC32 crc = new CRC32();

            int c;
            while ((c = in.read()) != -1) {
                crc.update(c);
            }
            return crc.getValue();
        }
    }

    /**
     * RandomAccessFile
     *
     * @param filename
     * @return
     * @throws IOException
     */
    public static long checksumRandomAccessFile(Path filename) throws IOException {
        try (RandomAccessFile file = new RandomAccessFile(filename.toFile(), "r")) {
            long length = file.length();
            CRC32 crc = new CRC32();

            for (long p = 0; p < length; p++) {
                file.seek(p);
                int c = file.readByte();
                crc.update(c);
            }
            return crc.getValue();
        }
    }

    /**
     * MappedByteBuffer
     *
     * @param filename
     * @return
     * @throws IOException
     */
    public static long checksumMappedFile(Path filename) throws IOException {
        try (FileChannel channel = FileChannel.open(filename)) {
            CRC32 crc = new CRC32();
            int length = (int) channel.size();
            MappedByteBuffer buffer = channel.map(FileChannel.MapMode.READ_ONLY, 0, length);

            for (int p = 0; p < length; p++) {
                int c = buffer.get(p);
                crc.update(c);
            }
            return crc.getValue();
        }
    }


    public static void main(String[] args) throws IOException {

        String name = "D:\\WorkSpace\\IntelliJ_workspace\\JavaLearn\\src\\iotest\\ZGC-Jfokus-2018.pdf";
        Path filename = Paths.get(name);
        long start, crcValue, end;

        System.out.print("Input Stream: ");
        start = System.currentTimeMillis();
        crcValue = checksumInputStream(filename);
        end = System.currentTimeMillis();
        System.out.print(Long.toHexString(crcValue) + "  ");
        System.out.println((end - start) + " milliseconds");

        System.out.print("Buffered Input Stream: ");
        start = System.currentTimeMillis();
        crcValue = checksumBufferedInputStream(filename);
        end = System.currentTimeMillis();
        System.out.print(Long.toHexString(crcValue) + "  ");
        System.out.println((end - start) + " milliseconds");

        System.out.print("Random Access File: ");
        start = System.currentTimeMillis();
        crcValue = checksumRandomAccessFile(filename);
        end = System.currentTimeMillis();
        System.out.print(Long.toHexString(crcValue) + "  ");
        System.out.println((end - start) + " milliseconds");

        System.out.print("Mapped File: ");
        start = System.currentTimeMillis();
        crcValue = checksumMappedFile(filename);
        end = System.currentTimeMillis();
        System.out.print(Long.toHexString(crcValue) + "  ");
        System.out.println((end - start) + " milliseconds");

        Path dir = Paths.get("D:\\WorkSpace\\IntelliJ_workspace\\JavaLearn\\src");

//        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
//            stream.forEach(System.out::println);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        try (Stream<Path> stream = Files.list(dir)) {
            Iterator<Path> iterator = stream.iterator();
            while (iterator.hasNext()) {
                Path path = iterator.next();
                System.out.println(path.getFileName());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
