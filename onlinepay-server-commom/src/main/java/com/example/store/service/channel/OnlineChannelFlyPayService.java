package com.example.store.service.channel;

import com.example.store.model.channel.Channel;
import com.example.store.service.channel.base.OnlineChannelBaseDefault;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service("FLYPAY")
public class OnlineChannelFlyPayService extends OnlineChannelBaseDefault {


    @Override
    public boolean needRegister() {
        Channel.FLYPAY.getChannleName();
        return true;
    }
}
