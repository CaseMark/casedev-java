package dev.case.api.errors

class CasedevInvalidDataException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : CasedevException(message, cause)
