.class final Lcom/sendbird/android/shadow/com/google/gson/internal/bind/ArrayTypeAdapter$1;
.super Ljava/lang/Object;
.source "ArrayTypeAdapter.java"

# interfaces
.implements Lcom/sendbird/android/shadow/com/google/gson/TypeAdapterFactory;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sendbird/android/shadow/com/google/gson/internal/bind/ArrayTypeAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public create(Lcom/sendbird/android/shadow/com/google/gson/Gson;Lcom/sendbird/android/shadow/com/google/gson/reflect/TypeToken;)Lcom/sendbird/android/shadow/com/google/gson/TypeAdapter;
    .locals 5
    .param p1, "gson"    # Lcom/sendbird/android/shadow/com/google/gson/Gson;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/sendbird/android/shadow/com/google/gson/Gson;",
            "Lcom/sendbird/android/shadow/com/google/gson/reflect/TypeToken",
            "<TT;>;)",
            "Lcom/sendbird/android/shadow/com/google/gson/TypeAdapter",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 42
    .local p2, "typeToken":Lcom/sendbird/android/shadow/com/google/gson/reflect/TypeToken;, "Lcom/sendbird/android/shadow/com/google/gson/reflect/TypeToken<TT;>;"
    invoke-virtual {p2}, Lcom/sendbird/android/shadow/com/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    move-result-object v2

    .line 43
    .local v2, "type":Ljava/lang/reflect/Type;
    instance-of v3, v2, Ljava/lang/reflect/GenericArrayType;

    if-nez v3, :cond_1

    instance-of v3, v2, Ljava/lang/Class;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Ljava/lang/Class;

    invoke-virtual {v3}, Ljava/lang/Class;->isArray()Z

    move-result v3

    if-nez v3, :cond_1

    .line 44
    :cond_0
    const/4 v3, 0x0

    .line 49
    :goto_0
    return-object v3

    .line 47
    :cond_1
    invoke-static {v2}, Lcom/sendbird/android/shadow/com/google/gson/internal/$Gson$Types;->getArrayComponentType(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    move-result-object v0

    .line 48
    .local v0, "componentType":Ljava/lang/reflect/Type;
    invoke-static {v0}, Lcom/sendbird/android/shadow/com/google/gson/reflect/TypeToken;->get(Ljava/lang/reflect/Type;)Lcom/sendbird/android/shadow/com/google/gson/reflect/TypeToken;

    move-result-object v3

    invoke-virtual {p1, v3}, Lcom/sendbird/android/shadow/com/google/gson/Gson;->getAdapter(Lcom/sendbird/android/shadow/com/google/gson/reflect/TypeToken;)Lcom/sendbird/android/shadow/com/google/gson/TypeAdapter;

    move-result-object v1

    .line 49
    .local v1, "componentTypeAdapter":Lcom/sendbird/android/shadow/com/google/gson/TypeAdapter;, "Lcom/sendbird/android/shadow/com/google/gson/TypeAdapter<*>;"
    new-instance v3, Lcom/sendbird/android/shadow/com/google/gson/internal/bind/ArrayTypeAdapter;

    invoke-static {v0}, Lcom/sendbird/android/shadow/com/google/gson/internal/$Gson$Types;->getRawType(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v4

    invoke-direct {v3, p1, v1, v4}, Lcom/sendbird/android/shadow/com/google/gson/internal/bind/ArrayTypeAdapter;-><init>(Lcom/sendbird/android/shadow/com/google/gson/Gson;Lcom/sendbird/android/shadow/com/google/gson/TypeAdapter;Ljava/lang/Class;)V

    goto :goto_0
.end method
