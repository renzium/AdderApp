#include <jni.h>

extern "C" JNIEXPORT jint JNICALL
Java_com_adderapp_AdderModule_add(JNIEnv* env, jobject obj, jint a, jint b) {
    return a + b;
}
