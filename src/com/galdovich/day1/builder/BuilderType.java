package com.galdovich.day1.builder;

import com.galdovich.day1.builder.command.Command;
import com.galdovich.day1.builder.command.impl.*;

public enum BuilderType {
    OVEN {
        {
            this.command = new Oven();
        }
    },
    LAPTOP {
        {
            this.command = new Laptop();
        }
    },
    REFRIGERATOR {
        {
            this.command = new Refrigerator();
        }
    },
    VACUUMCLEANER {
        {
            this.command = new VacuumCleaner();
        }
    },
    TABLETPC {
        {
            this.command = new TabletPC();
        }
    },
    SPEAKERS {
        {
            this.command = new Speakers();
        }
    };

    Command command;

    public Command getCommand() {
        return command;
    }
}
