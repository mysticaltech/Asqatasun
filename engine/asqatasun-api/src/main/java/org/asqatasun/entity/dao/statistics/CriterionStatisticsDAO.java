/*
 * Asqatasun - Automated webpage assessment
 * Copyright (C) 2008-2019  Asqatasun.org
 *
 * This file is part of Asqatasun.
 *
 * Asqatasun is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Contact us by mail: asqatasun AT asqatasun DOT org
 */
package org.asqatasun.entity.dao.statistics;

import java.util.Collection;

import org.asqatasun.entity.audit.TestSolution;
import org.asqatasun.entity.reference.Criterion;
import org.asqatasun.entity.reference.Theme;
import org.asqatasun.entity.statistics.CriterionStatistics;
import org.asqatasun.entity.statistics.WebResourceStatistics;
import org.asqatasun.entity.subject.WebResource;
import org.asqatasun.sdk.entity.dao.GenericDAO;

/**
 *
 * @author jkowalczyk
 */
public interface CriterionStatisticsDAO extends GenericDAO<CriterionStatistics, Long> {

    /**
     *
     * @return
     */
    Class<? extends WebResource> getWebResourceEntityClass();

    /**
     * 
     * @param webResource
     * @param testSolution
     * @param criterion
     * @return
     */
    Long findResultCountByResultTypeAndCriterion(
            WebResource webResource,
            TestSolution testSolution,
            Criterion criterion);
    /**
     * 
     * @param webResource
     * @param testSolution
     * @param theme
     * @return
     */
    Long findResultCountByResultTypeAndTheme(
            WebResource webResource,
            TestSolution testSolution,
            Theme theme);
    
    /**
     * 
     * @param webResource
     * @param theme
     * @param testSolution
     * @return
     */
    Collection<CriterionStatistics> findCriterionStatisticsByWebResource(
            WebResource webResource,
            String theme,
            Collection<String> testSolution);
    
    /**
     * 
     * @param webResourceId
     * @return 
     */
    Long findCriterionStatisticsCountByWebResource(Long webResourceId);
    
    
    
    /**
     * Getting the CriterionStatistics by web resources statistics
     * @param webResourceStatistics The web resources statistics
     * @return List of CriterionStatistics by web resources statistics
     */
    CriterionStatistics findCriterionStatisticsByWebResource(Criterion criterion ,WebResourceStatistics webResourceStatistics);



}
