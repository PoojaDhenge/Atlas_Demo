package com.qk.carina.demo.api;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class Posttokengen extends AbstractApiMethodV2 {
    public Posttokengen() {
        super(null,"api/users/post/rs.json");
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
        //replaceUrlPlaceholder("userid", userid);
    }
}
