package com.bbva.datioamproduct.utils.flow.impl



import com.bbva.datioamproduct.utils.com.flow.KeyConfigReader
import com.typesafe.config.Config


class InputKeyConfigReader(override val config: Config) extends KeyConfigReader {
   override val path: String = s"app.inputs"


}
