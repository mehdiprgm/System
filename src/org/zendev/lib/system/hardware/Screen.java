package org.zendev.lib.system.hardware;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * @author Mehdi Lavasani (ZENDEV)
 * @version 3.0
 * @since 17
 */
public class Screen {

    /**
     * Take a screenshot from entire screen.
     *
     * @param savePath The path you want to save the image into.
     * @return True if taking screenshot was successful and false if not.
     * @throws AWTException Signals that an Abstract Window Toolkit exception has occurred
     * @throws IOException  Signals that an I/O exception to some sort has occurred.
     */
    public static boolean takeScreenShot(String savePath) throws AWTException, IOException {
        return takeScreenShot(savePath, new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
    }

    /**
     * Take a screenshot from entire screen.
     *
     * @param savePath  The path you want to save the image into.
     * @param rectangle specifies an area in a coordinate space that is enclosed by the Rectangle object's top-left point ( x , y ) in the coordinate space, its width, and its height
     * @return True if taking screenshot was successful and false if not.
     * @throws AWTException Signals that an Abstract Window Toolkit exception has occurred
     * @throws IOException  Signals that an I/O exception to some sort has occurred.
     */
    public static boolean takeScreenShot(String savePath, Rectangle rectangle) throws AWTException, IOException {
        BufferedImage image = new Robot().createScreenCapture(rectangle);
        ImageIO.write(image, "png", new File(savePath));

        return true;
    }

    /**
     * Get the screen width.
     *
     * @return Returns the screen width.
     */
    public static double getWidth() {
        return Toolkit.getDefaultToolkit().getScreenSize().getWidth();
    }

    /**
     * Get the screen height.
     *
     * @return Returns the screen height.
     */
    public static double getHeight() {
        return Toolkit.getDefaultToolkit().getScreenSize().getHeight();
    }
}
