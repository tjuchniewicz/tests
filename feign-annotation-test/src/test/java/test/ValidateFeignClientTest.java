package test;
import org.junit.Test;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.core.annotation.AnnotationUtils;

public class ValidateFeignClientTest {

    @Test
    public void findAnnotationTest() {
		// fails with Spring 4.2.6
		// works fine with Spring 4.1.9
        AnnotationUtils.findAnnotation(new TestFeignClient().getClass(), FeignClient.class);
    }
}

@FeignClient
class TestFeignClient {
    
}
