package com.liuwen.Controller;

/**
 * @description: Good good study,day day up!
 * @author: Liu Wen
 * @create: 2020-03-01 15:11
 **/
    import com.liuwen.entity.Student;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.RequestMapping;
    import org.springframework.web.bind.annotation.RestController;
    import org.springframework.web.client.RestTemplate;

    import java.util.Collection;
    @RestController
    @RequestMapping("/ribbon")
    public class RibbonHandler {
        @Autowired
        private RestTemplate restTemplate;
        @GetMapping("/findAll")
        public Collection<Student> findAll(){
            return restTemplate.getForObject("http://provider/student/findAll",Collection.class);
        }
        @GetMapping("/index")
        public String index(){
            return restTemplate.getForObject("http://provider/student/index",String.class);
        }
    }

