/*
 * Copyright 1999-2101 Alibaba Group Holding Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.alibaba.druid.sql.dialect.sqlserver.visitor;

import com.alibaba.druid.sql.dialect.sqlserver.ast.SQLServerOutput;
import com.alibaba.druid.sql.dialect.sqlserver.ast.SQLServerSelect;
import com.alibaba.druid.sql.dialect.sqlserver.ast.SQLServerSelectQueryBlock;
import com.alibaba.druid.sql.dialect.sqlserver.ast.SQLServerTop;
import com.alibaba.druid.sql.dialect.sqlserver.ast.expr.SQLServerObjectReferenceExpr;
import com.alibaba.druid.sql.visitor.SQLASTVisitorAdapter;

public class SQLServerASTVisitorAdapter extends SQLASTVisitorAdapter implements SQLServerASTVisitor {

    @Override
    public boolean visit(SQLServerSelectQueryBlock x) {
        return true;
    }

    @Override
    public void endVisit(SQLServerSelectQueryBlock x) {

    }

    @Override
    public boolean visit(SQLServerTop x) {
        return true;
    }

    @Override
    public void endVisit(SQLServerTop x) {

    }

    @Override
    public boolean visit(SQLServerObjectReferenceExpr x) {
        return true;
    }

    @Override
    public void endVisit(SQLServerObjectReferenceExpr x) {

    }

    @Override
    public boolean visit(SQLServerOutput x) {
        return true;
    }

    @Override
    public void endVisit(SQLServerOutput x) {

    }
    
    @Override
    public boolean visit(SQLServerSelect x) {
        return true;
    }
    
    @Override
    public void endVisit(SQLServerSelect x) {
        
    }
}
