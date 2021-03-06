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
package org.kiliko.examples.heroku.flow.staticmenu;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.i18n.LocaleChangeEvent;
import com.vaadin.flow.i18n.LocaleChangeObserver;

/**
 * An abstract view which automatically contains a text, which tells the name of
 * the view.
 *
 * @author Vaadin
 */
public abstract class DummyView extends Div implements LocaleChangeObserver {

    /**
     * Creates the view.
     */
    public DummyView() {
        setClassName("content");
    }

    @Override
    public void localeChange(LocaleChangeEvent event) {
        setText(getTranslation("dummy.view",
                Util.getNavigationTargetName(getClass())));
    }
}
