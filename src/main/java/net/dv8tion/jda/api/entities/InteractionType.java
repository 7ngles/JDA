/*
 * Copyright 2015 Austin Keener, Michael Ritter, Florian Spieß, and the JDA contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.dv8tion.jda.api.entities;

public enum InteractionType
{
    UNKNOWN(-1), PING(1), SLASH_COMMAND(2);

    private final int key;

    InteractionType(int key)
    {
        this.key = key;
    }

    public int getKey()
    {
        return key;
    }

    public static InteractionType fromKey(int key)
    {
        switch (key)
        {
        case 1:
            return PING;
        case 2:
            return SLASH_COMMAND;
        default:
            return UNKNOWN;
        }
    }
}
