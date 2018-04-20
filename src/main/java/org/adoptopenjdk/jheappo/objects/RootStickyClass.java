package com.kodewerk.jheappo.objects;

/*
 * Copyright (c) 2018 Kirk Pepperdine.
 * Licensed under https://github.com/AdoptOpenJDK/jheappo/blob/master/LICENSE
 * Instructions: https://github.com/AdoptOpenJDK/jheappo/wiki
 */


import com.kodewerk.jheappo.io.HeapDumpBuffer;

public class RootStickyClass extends HeapData {

    public static final int TAG = 0x05;

    private long objectID;

    public RootStickyClass(HeapDumpBuffer buffer) {
        objectID = buffer.extractID();
    }
}