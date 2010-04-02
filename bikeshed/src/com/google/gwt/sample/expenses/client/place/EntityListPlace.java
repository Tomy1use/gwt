/*
 * Copyright 2010 Google Inc.
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
package com.google.gwt.sample.expenses.client.place;

import com.google.gwt.sample.expenses.shared.ExpensesEntityKey;

/**
 * Place in the app that lists all Entities of a type.
 */
public class EntityListPlace extends AbstractExpensesPlace {
  private final ExpensesEntityKey<?> key;

  /**
   * @param key the schema of the entities at this place
   */
  public EntityListPlace(ExpensesEntityKey<?> key) {
    this.key = key;
  }
  
  public ExpensesEntityKey<?> getKey() {
    return key;
  }
}