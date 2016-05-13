package test;
import org.junit.Test;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.core.annotation.AnnotationUtils;

public class ValidateFeignClientTest {

    @Test
    public void findAnnotationTest() {
        AnnotationUtils.findAnnotation(new TestFeignClient().getClass(), FeignClient.class);
    }
}

@FeignClient
class TestFeignClient {
    
}
