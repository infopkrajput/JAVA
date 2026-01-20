#include "jni.h"
#include <stdio.h>
#include "NativeExample.h"

JNIEXPORT void JNICALL Java_NativeExample_displayMessage(JNIEnv *env, jobject obj) {
    printf("Hello from native code!\n");
}
