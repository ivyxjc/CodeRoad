package xyz.ivyxjc.beans.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by ivxyjc on 2017/1/6.
 */
public interface Resource {
    InputStream getInputStream()throws IOException;
}
