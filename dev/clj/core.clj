(ns core
  (:require
    [clojure.pprint :refer [pprint]]
    [mount.core :as mount :refer [defstate]]
    [conf :refer [config]]
    [example :refer [foo]]))

(defn start []
  (mount/start))

(defn stop []
  (mount/stop))

(defn reset []
  (stop)
  (start))

(mount/in-cljc-mode)
