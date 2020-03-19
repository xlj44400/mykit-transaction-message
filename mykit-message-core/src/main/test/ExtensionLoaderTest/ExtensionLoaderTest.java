package ExtensionLoaderTest;

import io.mykit.transaction.message.common.utils.extension.ExtensionLoader;
import io.mykit.transaction.message.core.spi.MykitCoordinatorRepository;
import org.junit.jupiter.api.Test;

/**
 * @author anel
 * @date 2020/3/19.
 */

public class ExtensionLoaderTest {

    @Test
    public void test(){
        final MykitCoordinatorRepository repository = ExtensionLoader.getExtensionLoader(MykitCoordinatorRepository.class)
                .getActivateExtension("db");

        System.out.println(repository);
    }
}
