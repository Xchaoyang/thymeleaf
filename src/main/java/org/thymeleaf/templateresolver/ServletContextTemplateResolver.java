/*
 * =============================================================================
 * 
 *   Copyright (c) 2011-2014, The THYMELEAF team (http://www.thymeleaf.org)
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 * 
 * =============================================================================
 */
package org.thymeleaf.templateresolver;

import javax.servlet.ServletContext;

import org.thymeleaf.exceptions.ConfigurationException;
import org.thymeleaf.resourceresolver.IResourceResolver;
import org.thymeleaf.resourceresolver.ServletContextResourceResolver;

/**
 * <p>
 *   Implementation of {@link ITemplateResolver} that extends {@link TemplateResolver}
 *   and uses a {@link ServletContextResourceResolver} for resource resolution.
 * </p>
 * 
 * @author Daniel Fern&aacute;ndez
 * 
 * @since 1.0
 *
 */
public class ServletContextTemplateResolver
        extends TemplateResolver {

    
    
    
    
    public ServletContextTemplateResolver(final ServletContext servletContext) {
        super();
        super.setResourceResolver(new ServletContextResourceResolver(servletContext));
    }
    
    
    
    
    
    /**
     * <p>
     *   This method <b>should not be called</b>, because the resource resolver is
     *   fixed to be {@link ServletContextResourceResolver}. Every execution of this method
     *   will result in an exception.
     * </p>
     * <p>
     *   If you need to select a different resource resolver, use the {@link TemplateResolver}
     *   class instead.
     * </p>
     * 
     * @param resourceResolver the new resource resolver
     */
    @Override
    public void setResourceResolver(final IResourceResolver resourceResolver) {
        throw new ConfigurationException(
                "Cannot set a resource resolver on " + this.getClass().getName() + ". If " +
                "you want to set your own resource resolver, use " + TemplateResolver.class.getName() + 
                "instead");
    }

    
    
    
    
}
