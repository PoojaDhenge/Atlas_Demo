package com.qk.carina.demo.api;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class Postcreateacc extends AbstractApiMethodV2 {
    public Postcreateacc() {
        super("api/users/Postcreate/rq.json","api/users/Postcreate/rs.json","api/users/Postcreate/create.properties");
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
        //replaceUrlPlaceholder("userid", userid);
    }


}
