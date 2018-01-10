(defproject basic-lein-clj "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [dynadoc "1.4.2"]
                 [org.clojure/data.json "0.2.6"]]
  :jvm-opts ^:replace ["-Xmx1g" "-server"]
  :plugins [[dynadoc/lein-dynadoc "1.4.2"]]
  :source-paths ["src" "target/classes"]
  :resource-paths ["resources"]
  :target-path "target"
  :main basic-lein-clj.core)
