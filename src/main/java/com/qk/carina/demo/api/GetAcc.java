package com.qk.carina.demo.api;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class GetAcc extends AbstractApiMethodV2 {
    public GetAcc(String id) {
        super(null,"api/users/get/rs.json");
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
        //replaceUrlPlaceholder("userid", userid);
    }
}
