/**
 * Copyright 2015 Palantir Technologies, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.palantir.giraffe.file.test.creator;

import java.io.IOException;

import com.palantir.giraffe.test.ScriptWriter;
import com.palantir.giraffe.test.TestFileCreatorCli.Creator;

/**
 * Creates test files for CRUD tests.
 *
 * @author bkeyes
 */
public class CrudTestCreator implements Creator {

    public static final String F_RO_READ = "ro_crud_read.txt";

    public static final String READ_DATA = "Can you read this now?";

    @Override
    public void createScript(ScriptWriter script) throws IOException {
        script.createFile(F_RO_READ, READ_DATA);
    }

}
