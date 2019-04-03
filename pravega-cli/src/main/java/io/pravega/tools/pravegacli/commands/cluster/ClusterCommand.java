/**
 * Copyright (c) 2017 Dell Inc., or its subsidiaries. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 */
package io.pravega.tools.pravegacli.commands.cluster;

import io.pravega.tools.pravegacli.commands.Command;
import io.pravega.tools.pravegacli.commands.CommandArgs;

/**
 * Base for any Cluster-related commands.
 */
public abstract class ClusterCommand extends Command {

    protected static final String COMPONENT = "cluster";

    ClusterCommand(CommandArgs args) {
        super(args);
    }
}
