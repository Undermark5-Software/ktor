/*
 * Copyright 2014-2023 JetBrains s.r.o and contributors. Use of this source code is governed by the Apache 2.0 license.
 */

package io.ktor.util

/**
 * Implementation of [ContentEncoder] using gzip algorithm
 */
public actual object GZipEncoder : ContentEncoder, Encoder by Identity {
    override val name: String = "gzip"
}

/**
 * Implementation of [ContentEncoder] using deflate algorithm
 */
public actual object DeflateEncoder : ContentEncoder, Encoder by Identity {
    override val name: String = "deflate"
}
