package com.park9eon.rx.hilt

import javax.inject.Inject

class TestService @Inject constructor() {
    fun foo(): String {
        return "foo"
    }
}