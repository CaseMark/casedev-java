package dev.case.api.errors

class CasedevIoException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : CasedevException(message, cause)
