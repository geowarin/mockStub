package demo.files;

import org.springframework.stereotype.Service;

@Service
public class FileSystemService implements FileSystem {

    @Override public boolean mkdir() {
        return true;
    }
}
