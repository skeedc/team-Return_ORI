
package retalservice.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@FeignClient(name="Collect", url="http://Collect:8080")
public interface CollectService {

    @RequestMapping(method= RequestMethod.GET, path="/collects")
    public void collect(@RequestBody Collect collect);

}