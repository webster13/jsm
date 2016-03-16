package com.webster.jsm.module.sys.service.impl;


import com.webster.jsm.core.service.impl.BaseServiceImpl;
import com.webster.jsm.module.sys.entity.Menu;
import com.webster.jsm.module.sys.mapper.MenuMapper;
import com.webster.jsm.module.sys.service.MenuService;
import org.springframework.stereotype.Service;

@Service("menuService")
public class MenuServiceImpl extends BaseServiceImpl<MenuMapper, Menu> implements MenuService {

}
