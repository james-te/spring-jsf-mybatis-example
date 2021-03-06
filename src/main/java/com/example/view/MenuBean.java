package com.example.view;

import com.example.domain.page.Page;
import com.example.domain.page.PageService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Menu bean for dynamic loading of all nav bar items
 * Created by Jakub Tucek on 12.09.2016.
 */
@Component
@Scope("application")
public class MenuBean {
    private final static Logger logger = Logger.getLogger(MenuBean.class);
    private List<Page> pages;

    @Autowired
    public MenuBean(PageService pageService) {
        pages = pageService.findAll();
    }

    public List<Page> getPages() {
        return pages;
    }

    public void setPages(List<Page> pages) {
        this.pages = pages;
    }

}
