sys.props.get("plugin.version") match {
  case Some(pluginVersion) => addSbtPlugin("io.grhodes.sbt" % "sbt-api-builder" % pluginVersion)
  case _                   => sys.error("""|The system property 'plugin.version' is not defined.
                                           |Specify this property using the scriptedLaunchOpts -D.""".stripMargin)
}
