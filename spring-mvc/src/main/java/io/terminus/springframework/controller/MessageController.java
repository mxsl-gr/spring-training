package io.terminus.springframework.controller;

import io.terminus.springframework.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by gengrong on 2017/3/19.
 */
@Controller
@RequestMapping("/api/messages")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("userName", "terminus");
        return mv;
    }

    @ResponseBody
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Map<String, String> showMessage(@PathVariable String id) {
        String message = messageService.getMessage();
        Map<String, String> record = new HashMap<String, String>();
        record.put("id", id);
        record.put("message", message);
        return record;
    }

}
