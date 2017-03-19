package io.terminus.springframework.service.impl;

import io.terminus.springframework.dao.MessageDao;
import io.terminus.springframework.service.MessageService;

/**
 * Created by gengrong on 2017/3/19.
 */
public class MessageServiceImpl implements MessageService {

    private MessageDao messageDao;

    @Override
    public String getMessage() {
        return messageDao.getMessage();
    }

    public MessageDao getMessageDao() {
        return messageDao;
    }

    public void setMessageDao(MessageDao messageDao) {
        this.messageDao = messageDao;
    }
}
