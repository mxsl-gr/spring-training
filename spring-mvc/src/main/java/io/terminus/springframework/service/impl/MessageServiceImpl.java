package io.terminus.springframework.service.impl;

import io.terminus.springframework.dao.MessageDao;
import io.terminus.springframework.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by gengrong on 2017/3/19.
 */
@Service("messageService")
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageDao messageDao;

    @Override
    public String getMessage() {
        return messageDao.getMessage();
    }

}
