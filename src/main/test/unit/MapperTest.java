package unit;

import com.aninstein.mapper.UsertbPOMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by lichangan on 2018/2/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:com/applicationContext.xml"})
public class MapperTest {

    @Autowired
    UsertbPOMapper usertbPOMapper;

    @Test
    public void testCRUD(){



    }
}
