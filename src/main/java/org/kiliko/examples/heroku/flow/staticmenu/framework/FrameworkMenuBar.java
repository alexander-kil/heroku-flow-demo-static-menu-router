/*
 * Copyright 2000-2017 Vaadin Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.kiliko.examples.heroku.flow.staticmenu.framework;

import org.kiliko.examples.heroku.flow.staticmenu.MainLayout;
import org.kiliko.examples.heroku.flow.staticmenu.SimpleMenuBar;
import org.kiliko.examples.heroku.flow.staticmenu.download.DocsView;

import com.vaadin.flow.router.ParentLayout;
import com.vaadin.flow.router.RoutePrefix;
import com.vaadin.flow.router.RouterLayout;

/**
 * The Framework menu.
 *
 * @author Vaadin
 */
@RoutePrefix("framework")
@ParentLayout(MainLayout.class)
public class FrameworkMenuBar extends SimpleMenuBar implements RouterLayout {

    /**
     * Creates the view.
     */
    public FrameworkMenuBar() {
        addMenuElement(TutorialView.class);
        addMenuElement(DocsView.class, "FrameworkDocumentation");
    }

}
