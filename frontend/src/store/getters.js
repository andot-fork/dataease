const getters = {
  sidebar: state => state.app.sidebar,
  language: state => state.user.language,
  size: state => state.app.size,
  device: state => state.app.device,
  token: state => state.user.token,
  avatar: state => state.user.avatar,
  name: state => state.user.name,
  introduction: state => state.user.introduction,
  user: state => state.user.user,
  roles: state => state.user.roles,
  loadMenus: state => state.user.loadMenus,
  permission_routes: state => state.permission.routes,
  addRouters: state => state.permission.addRouters,
  errorLogs: state => state.errorLog.logs,
  sceneData: state => state.dataset.sceneData,
  table: state => state.dataset.table,
  loadingMap: state => state.request.loadingMap,
  currentPath: state => state.permission.currentPath,
  permissions: state => state.user.permissions,
  beanMap: state => state.application.beanMap,
  leftWidgetMap: state => state.application.leftWidgetMap,
  dialogWidgetMap: state => state.application.dialogWidgetMap,
  drawWidgetMap: state => state.application.drawWidgetMap,
  validate: state => state.lic.validate,
  licMsg: state => state.lic.licMsg,
  uiInfo: state => state.user.uiInfo,
  conditions: state => state.conditions.conditions,
  msgTypes: state => state.msg.msgTypes,
  geoMap: state => state.map.geoMap
}
export default getters
