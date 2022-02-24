package topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @Autowired
    TopicService topicService;

    @RequestMapping("/topics")
    public List<Topic> getALlTopics(){
        return topicService.getAllTopics();
    }

    @RequestMapping("topics/{id}")
    public Topic getTopic(@PathVariable String id){
        return this.topicService.getTopic(id);
    }
}
