package Extra;



import Extra.JPAOMRuntimeException;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public final class LoadImage
{

      private LoadImage()
      {

      }

      public static void on(String[] path,BufferedImage[] sprite)
      {

            for (var i = 0; i < sprite.length; i++)
            {
                  tryToLoad(path,sprite,i);
            }

      }

      private static void tryToLoad(String[] path,BufferedImage[] sprite,int i)
      {
            try
            {
                  sprite[i] = ImageIO.read(new File(path[i]));
            }
            catch (final IOException e)
            {
                  throw new JPAOMRuntimeException("Fatal error reading the ImageIO,verify the image or the path.");
            }
      }

}
