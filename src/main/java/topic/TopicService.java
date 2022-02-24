package topic;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private final List<Topic> topics = Arrays.asList(
                new Topic("some id0", "some name0", "a description0"),
                new Topic("some id1", "some name1", "a description1"),
                new Topic("some id2", "some name2", "a description2")
        );

    public List<Topic> getAllTopics(){
        return this.topics;
    }

    public Topic getTopic(String id){
        return this.topics.stream().filter(t -> t.id.equals(id)).findFirst().get();
    }
}
