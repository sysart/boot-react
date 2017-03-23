package react.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import react.model.Two;
import react.repositories.TwoRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@RestController
public class SimpleResource {

  @Autowired
  private TwoRepository twoRepository;

  @RequestMapping("/api/hehe")
  public List<Two> hehe() {
    ArrayList<Two> list = new ArrayList<>();
    this.twoRepository.findAll().forEach(list::add);
    return list;
  }
}
