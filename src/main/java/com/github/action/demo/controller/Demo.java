package com.github.action.demo.controller;

import com.sofast.cloud.common.domain.vo.R;
import com.sofast.cloud.core.web.controller.BaseController;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "demo", tags = "demo")
@RestController
@RequestMapping("/demo/")
public class Demo extends BaseController {

    public R<String> test() {
        return R.ok();
    }

}
